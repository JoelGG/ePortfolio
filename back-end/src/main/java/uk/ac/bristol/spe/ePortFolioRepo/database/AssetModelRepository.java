package uk.ac.bristol.spe.ePortFolioRepo.database;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.bristol.spe.ePortFolioRepo.model.AssetModel;

@Repository
public interface AssetModelRepository extends JpaRepository<AssetModel, Long> {
  Page<AssetModel> findByPostId(Long postId, Pageable pageable);
}
