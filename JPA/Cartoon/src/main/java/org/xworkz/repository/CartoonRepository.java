package org.xworkz.repository;

import org.xworkz.dto.Cartoon;

import java.util.List;

public interface CartoonRepository {

    public void save(Cartoon cartoon);
    public void delete(int id);

    public Cartoon find(int id);
    public void update(int id, String name);

    public List<Cartoon> getCartoonByName(String name);
    public List<Cartoon> getCartoonByGenderMatches(String name);
    public List<Cartoon> getCartoonByTypes(List<String> types);
}
