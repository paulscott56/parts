package search.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import search.model.Doc;

import java.util.List;

/**
 * Created by paul on 2016/05/03.
 */
public interface DocumentRepository extends ElasticsearchRepository<Doc, Long> {
    public List<Doc> findByName(String name);

}