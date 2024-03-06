package com.example.serenity.dtos.requests.clients.components;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryComponent {

    private Long id;
    private String name;

    public static CategoryComponentBuilder builder() {
        return new CategoryComponentBuilder();
    }

    public static class CategoryComponentBuilder {
        private Long id;
        private String name;

        public CategoryComponentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CategoryComponent build() {
            return new CategoryComponent(this);
        }
    }

    private CategoryComponent(CategoryComponentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }
}

//    private Long id;
//    private String name;
//
//    public static CategoryComponentBuilder defaultCategoryBuilder() {
//        return CategoryComponent.builder()
//                .name("initClient");
//    }
//}
