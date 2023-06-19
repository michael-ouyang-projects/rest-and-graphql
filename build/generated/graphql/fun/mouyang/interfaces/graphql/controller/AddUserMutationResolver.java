package fun.mouyang.interfaces.graphql.controller;

import fun.mouyang.interfaces.graphql.dto.*;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2023-06-19T19:12:30+0800"
)
public interface AddUserMutationResolver {

    User addUser(String id, String name, Integer age) throws Exception;

}
