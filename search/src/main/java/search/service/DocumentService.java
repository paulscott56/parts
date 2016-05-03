package search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import search.model.Doc;
import search.repo.DocumentRepository;

import java.util.List;

/**
 * Created by paul on 2016/05/03.
 */
@Service
public class DocumentService {

    @Autowired
    private DocumentRepository repository;

    public List<Doc> getByName(String name) {
        return repository.findByName(name);
    }

    public void addMovie(Doc doc) {
        repository.save(doc);
    }
}