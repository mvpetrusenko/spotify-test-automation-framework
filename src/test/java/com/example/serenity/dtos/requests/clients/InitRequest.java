package com.example.serenity.dtos.requests.clients;

import com.example.serenity.dtos.requests.clients.components.CategoryComponent;
import com.example.serenity.dtos.requests.clients.components.TagComponent;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;



import java.util.List;

@Data
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InitRequest {

    private Long id;
    private String name;
    private String status;
    private List<String> photoUrls;
    private CategoryComponent category;
    private List<TagComponent> tags;


    public static InitRequestBuilder builder() {
        return new InitRequestBuilder();
    }

    public static class InitRequestBuilder {
        private Long id;
        private String name;
        private String status;
        private List<String> photoUrls;
        private CategoryComponent category;
        private List<TagComponent> tags;

        public InitRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        // Add other builder methods as needed

        public InitRequest build() {
            return new InitRequest(this);
        }
    }

    private InitRequest(InitRequestBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.status = builder.status;
        this.photoUrls = builder.photoUrls;
        this.category = builder.category;
        this.tags = builder.tags;
    }

    // Other methods as needed
}

//    public static InitRequestBuilder defaultInitBuilder() {
//        return InitRequest.builder()
//                .name("New playlist")
//                .status("available")
//                .photoUrls(List.of("https://www.baidu.com/img/bd_logo1.png"))
//                .tags(List.of(TagComponent.defaultTagBuilder().build()))
//                .category(CategoryComponent.defaultCategoryBuilder().build());
//    }
//}
