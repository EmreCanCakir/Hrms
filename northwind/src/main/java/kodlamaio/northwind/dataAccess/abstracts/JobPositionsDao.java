package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concretes.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionsDao extends JpaRepository <JobPositions, Integer> {

    /**JpaRepository'i extends edip icine Entities'deki nesneyi belirttik ve onun primary key'ini.*/

}
