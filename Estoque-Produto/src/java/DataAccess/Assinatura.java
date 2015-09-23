package DataAccess;

import java.util.List;

public interface Assinatura<T> {

    void Insert(T item) throws Exception;

    void Update(T item) throws Exception;

    void Delete(T item) throws Exception;

    List<T> GetAll() throws Exception;

    T Get(int id) throws Exception;

}
