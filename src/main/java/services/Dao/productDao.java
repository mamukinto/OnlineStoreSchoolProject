package services.Dao;

import model.Computer;
import model.Phone;
import model.TV;

import java.util.List;

public interface productDao {
    void addPhone(Phone phone);
    void addTV(TV tv);
    void addComputer(Computer computer);
    List<Phone> getPhones();
    List<TV> getTV();
    List<Computer>getComputer();

}
