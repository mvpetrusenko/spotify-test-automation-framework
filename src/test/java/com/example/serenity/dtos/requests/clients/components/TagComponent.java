package com.example.serenity.dtos.requests.clients.components;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagComponent {

    private Long id;
    private String name;

    public static TagComponentBuilder builder() {
        return new TagComponentBuilder();
    }

    public static class TagComponentBuilder {
        private Long id;
        private String name;

        public TagComponentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TagComponent build() {
            return new TagComponent(this);
        }
    }

    private TagComponent(TagComponentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }
}

//    private Long id;
//    private String name;
//
//    public static TagComponentBuilder defaultTagBuilder() {
//        return TagComponent.builder()
//                .name("init");
//    }
//}
