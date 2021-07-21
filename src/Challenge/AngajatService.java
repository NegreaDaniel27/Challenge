package Challenge;

import Dao.AngajatDao;
import Model.Angajat;

import java.util.List;

public class AngajatService {

    private AngajatDao angajatDao;

    public AngajatService() {
        this.angajatDao = new AngajatDao();
    }

    public List<Angajat> angajatList(){
        return AngajatDao.findAll();
    }
}
