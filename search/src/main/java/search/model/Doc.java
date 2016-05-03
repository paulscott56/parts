package search.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by paul on 2016/05/03.
 */
@Document(indexName = "docs", type = "doc")
public class Doc {

    @Id
    private String id;

    private String name;

}
