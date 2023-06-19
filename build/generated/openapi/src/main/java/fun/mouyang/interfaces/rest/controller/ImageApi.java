/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fun.mouyang.interfaces.rest.controller;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-19T19:12:53.287570+08:00[Asia/Taipei]")
@Validated
@Tag(name = "Image", description = "the Image API")
public interface ImageApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /image
     *
     * @param image  (required)
     * @param purpose  (optional)
     * @return upload image successfully (status code 201)
     */
    @Operation(
        operationId = "uploadImage",
        tags = { "Image" },
        responses = {
            @ApiResponse(responseCode = "201", description = "upload image successfully", content = {
                @Content(mediaType = "application/json;charset=UTF-8", schema = @Schema(implementation = String.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/image",
        produces = { "application/json;charset=UTF-8" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<String> uploadImage(
        @Parameter(name = "image", description = "", required = true) @RequestPart(value = "image", required = true) MultipartFile image,
        @Parameter(name = "purpose", description = "") @Valid @RequestParam(value = "purpose", required = false) String purpose
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
