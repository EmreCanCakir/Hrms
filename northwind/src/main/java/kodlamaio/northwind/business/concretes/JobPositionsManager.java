package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.JobPositionsService;
import kodlamaio.northwind.dataAccess.abstracts.JobPositionsDao;
import kodlamaio.northwind.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service   //Bu class projede servis gorevi gorecek yani business katmani diye springe bilgi veriyoruz.
public class JobPositionsManager implements JobPositionsService {
    @Autowired  // Spring jobPositionsDao 'ya karsilik gelebilecek bir sinif olusturuyor arka planda !!!
    public JobPositionsManager(JobPositionsDao jobPositionsDao) {
        super();
        this.jobPositionsDao = jobPositionsDao;
    }

    private JobPositionsDao jobPositionsDao;

    @Override
    public List<JobPositions> getAll() {
        return this.jobPositionsDao.findAll();
    }

}
