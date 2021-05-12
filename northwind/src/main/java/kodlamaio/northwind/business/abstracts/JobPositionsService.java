package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.entities.concretes.JobPositions;

import java.util.List;

public interface JobPositionsService {
    List <JobPositions> getAll();
}
