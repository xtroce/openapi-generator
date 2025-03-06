package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.io.File;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.Pet;
import java.util.Set;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
public class PetApi {
    private ApiClient apiClient;

    public PetApi() {
        this(new ApiClient());
    }

    @Autowired
    public PetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Add a new pet to the store
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param pet Pet object that needs to be added to the store
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addPetRequestCreation(Pet pet) throws WebClientResponseException {
        Object postBody = pet;
        // verify the required parameter 'pet' is set
        if (pet == null) {
            throw new WebClientResponseException("Missing the required parameter 'pet' when calling addPet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/pet", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a new pet to the store
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param pet Pet object that needs to be added to the store
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> addPet(Pet pet) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return addPetRequestCreation(pet).bodyToMono(localVarReturnType);
    }

    /**
     * Add a new pet to the store
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param pet Pet object that needs to be added to the store
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> addPetWithHttpInfo(Pet pet) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return addPetRequestCreation(pet).toEntity(localVarReturnType);
    }

    /**
     * Add a new pet to the store
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param pet Pet object that needs to be added to the store
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addPetWithResponseSpec(Pet pet) throws WebClientResponseException {
        return addPetRequestCreation(pet);
    }

    public class DeletePetRequest {
        private Long petId;
        private String apiKey;

        public DeletePetRequest() {}

        public DeletePetRequest(Long petId, String apiKey) {
            this.petId = petId;
            this.apiKey = apiKey;
        }

        public Long petId() {
            return this.petId;
        }
        public DeletePetRequest petId(Long petId) {
            this.petId = petId;
            return this;
        }

        public String apiKey() {
            return this.apiKey;
        }
        public DeletePetRequest apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

    }

      /**
      * Deletes a pet
      * 
         * <p><b>200</b> - Successful operation
         * <p><b>400</b> - Invalid pet value
         * @param requestParameters The deletePet request parameters as object
         * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public Mono<Void> deletePet(DeletePetRequest requestParameters) throws WebClientResponseException {
          return this.deletePet(requestParameters.petId(), requestParameters.apiKey());
      }

      /**
      * Deletes a pet
      * 
         * <p><b>200</b> - Successful operation
         * <p><b>400</b> - Invalid pet value
         * @param requestParameters The deletePet request parameters as object
         * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public Mono<ResponseEntity<Void>> deletePetWithHttpInfo(DeletePetRequest requestParameters) throws WebClientResponseException {
          return this.deletePetWithHttpInfo(requestParameters.petId(), requestParameters.apiKey());
      }

      /**
      * Deletes a pet
      * 
         * <p><b>200</b> - Successful operation
         * <p><b>400</b> - Invalid pet value
         * @param requestParameters The deletePet request parameters as object
      * @return ResponseSpec
      * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public ResponseSpec deletePetWithResponseSpec(DeletePetRequest requestParameters) throws WebClientResponseException {
         return this.deletePetWithResponseSpec(requestParameters.petId(), requestParameters.apiKey());
      }

          
    /**
     * Deletes a pet
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid pet value
     * @param petId Pet id to delete
     * @param apiKey The apiKey parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deletePetRequestCreation(Long petId, String apiKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new WebClientResponseException("Missing the required parameter 'petId' when calling deletePet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("petId", petId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();


        if (apiKey != null)
        headerParams.add("api_key", apiClient.parameterToString(apiKey));
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/pet/{petId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes a pet
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid pet value
     * @param petId Pet id to delete
     * @param apiKey The apiKey parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deletePet(Long petId, String apiKey) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deletePetRequestCreation(petId, apiKey).bodyToMono(localVarReturnType);
    }

    /**
     * Deletes a pet
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid pet value
     * @param petId Pet id to delete
     * @param apiKey The apiKey parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> deletePetWithHttpInfo(Long petId, String apiKey) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deletePetRequestCreation(petId, apiKey).toEntity(localVarReturnType);
    }

    /**
     * Deletes a pet
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid pet value
     * @param petId Pet id to delete
     * @param apiKey The apiKey parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deletePetWithResponseSpec(Long petId, String apiKey) throws WebClientResponseException {
        return deletePetRequestCreation(petId, apiKey);
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid status value
     * @param status Status values that need to be considered for filter
     * @return List&lt;Pet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findPetsByStatusRequestCreation(List<String> status) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new WebClientResponseException("Missing the required parameter 'status' when calling findPetsByStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "status", status));
        
        final String[] localVarAccepts = { 
            "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<Pet> localVarReturnType = new ParameterizedTypeReference<Pet>() {};
        return apiClient.invokeAPI("/pet/findByStatus", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid status value
     * @param status Status values that need to be considered for filter
     * @return List&lt;Pet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Pet> findPetsByStatus(List<String> status) throws WebClientResponseException {
        ParameterizedTypeReference<Pet> localVarReturnType = new ParameterizedTypeReference<Pet>() {};
        return findPetsByStatusRequestCreation(status).bodyToFlux(localVarReturnType).collectList().block();
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid status value
     * @param status Status values that need to be considered for filter
     * @return ResponseEntity&lt;List&lt;Pet&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Pet>> findPetsByStatusWithHttpInfo(List<String> status) throws WebClientResponseException {
        ParameterizedTypeReference<Pet> localVarReturnType = new ParameterizedTypeReference<Pet>() {};
        return findPetsByStatusRequestCreation(status).toEntityList(localVarReturnType).block();
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid status value
     * @param status Status values that need to be considered for filter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findPetsByStatusWithResponseSpec(List<String> status) throws WebClientResponseException {
        return findPetsByStatusRequestCreation(status);
    }

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid tag value
     * @param tags Tags to filter by
     * @return Set&lt;Pet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    private ResponseSpec findPetsByTagsRequestCreation(Set<String> tags) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'tags' is set
        if (tags == null) {
            throw new WebClientResponseException("Missing the required parameter 'tags' when calling findPetsByTags", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "tags", tags));
        
        final String[] localVarAccepts = { 
            "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<Pet> localVarReturnType = new ParameterizedTypeReference<Pet>() {};
        return apiClient.invokeAPI("/pet/findByTags", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid tag value
     * @param tags Tags to filter by
     * @return Set&lt;Pet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Set<Pet> findPetsByTags(Set<String> tags) throws WebClientResponseException {
        ParameterizedTypeReference<Pet> localVarReturnType = new ParameterizedTypeReference<Pet>() {};
        return findPetsByTagsRequestCreation(tags).bodyToFlux(localVarReturnType).collect(Collectors.toSet()).block();
    }

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid tag value
     * @param tags Tags to filter by
     * @return ResponseEntity&lt;Set&lt;Pet&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Pet>> findPetsByTagsWithHttpInfo(Set<String> tags) throws WebClientResponseException {
        ParameterizedTypeReference<Pet> localVarReturnType = new ParameterizedTypeReference<Pet>() {};
        return findPetsByTagsRequestCreation(tags).toEntityList(localVarReturnType).block();
    }

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid tag value
     * @param tags Tags to filter by
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findPetsByTagsWithResponseSpec(Set<String> tags) throws WebClientResponseException {
        return findPetsByTagsRequestCreation(tags);
    }

    /**
     * Find pet by ID
     * Returns a single pet
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Pet not found
     * @param petId ID of pet to return
     * @return Pet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPetByIdRequestCreation(Long petId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new WebClientResponseException("Missing the required parameter 'petId' when calling getPetById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("petId", petId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/xml", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<Pet> localVarReturnType = new ParameterizedTypeReference<Pet>() {};
        return apiClient.invokeAPI("/pet/{petId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Find pet by ID
     * Returns a single pet
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Pet not found
     * @param petId ID of pet to return
     * @return Pet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Pet getPetById(Long petId) throws WebClientResponseException {
        ParameterizedTypeReference<Pet> localVarReturnType = new ParameterizedTypeReference<Pet>() {};
        return getPetByIdRequestCreation(petId).bodyToMono(localVarReturnType).block();
    }

    /**
     * Find pet by ID
     * Returns a single pet
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Pet not found
     * @param petId ID of pet to return
     * @return ResponseEntity&lt;Pet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Pet> getPetByIdWithHttpInfo(Long petId) throws WebClientResponseException {
        ParameterizedTypeReference<Pet> localVarReturnType = new ParameterizedTypeReference<Pet>() {};
        return getPetByIdRequestCreation(petId).toEntity(localVarReturnType).block();
    }

    /**
     * Find pet by ID
     * Returns a single pet
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Pet not found
     * @param petId ID of pet to return
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPetByIdWithResponseSpec(Long petId) throws WebClientResponseException {
        return getPetByIdRequestCreation(petId);
    }

    /**
     * Update an existing pet
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Pet not found
     * <p><b>405</b> - Validation exception
     * @param pet Pet object that needs to be added to the store
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updatePetRequestCreation(Pet pet) throws WebClientResponseException {
        Object postBody = pet;
        // verify the required parameter 'pet' is set
        if (pet == null) {
            throw new WebClientResponseException("Missing the required parameter 'pet' when calling updatePet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/pet", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update an existing pet
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Pet not found
     * <p><b>405</b> - Validation exception
     * @param pet Pet object that needs to be added to the store
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public void updatePet(Pet pet) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        updatePetRequestCreation(pet).bodyToMono(localVarReturnType).block();
    }

    /**
     * Update an existing pet
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Pet not found
     * <p><b>405</b> - Validation exception
     * @param pet Pet object that needs to be added to the store
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updatePetWithHttpInfo(Pet pet) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return updatePetRequestCreation(pet).toEntity(localVarReturnType).block();
    }

    /**
     * Update an existing pet
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Pet not found
     * <p><b>405</b> - Validation exception
     * @param pet Pet object that needs to be added to the store
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updatePetWithResponseSpec(Pet pet) throws WebClientResponseException {
        return updatePetRequestCreation(pet);
    }

    public class UpdatePetWithFormRequest {
        private Long petId;
        private String name;
        private String status;

        public UpdatePetWithFormRequest() {}

        public UpdatePetWithFormRequest(Long petId, String name, String status) {
            this.petId = petId;
            this.name = name;
            this.status = status;
        }

        public Long petId() {
            return this.petId;
        }
        public UpdatePetWithFormRequest petId(Long petId) {
            this.petId = petId;
            return this;
        }

        public String name() {
            return this.name;
        }
        public UpdatePetWithFormRequest name(String name) {
            this.name = name;
            return this;
        }

        public String status() {
            return this.status;
        }
        public UpdatePetWithFormRequest status(String status) {
            this.status = status;
            return this;
        }

    }

      /**
      * Updates a pet in the store with form data
      * 
         * <p><b>200</b> - Successful operation
         * <p><b>405</b> - Invalid input
         * @param requestParameters The updatePetWithForm request parameters as object
         * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public Mono<Void> updatePetWithForm(UpdatePetWithFormRequest requestParameters) throws WebClientResponseException {
          return this.updatePetWithForm(requestParameters.petId(), requestParameters.name(), requestParameters.status());
      }

      /**
      * Updates a pet in the store with form data
      * 
         * <p><b>200</b> - Successful operation
         * <p><b>405</b> - Invalid input
         * @param requestParameters The updatePetWithForm request parameters as object
         * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public Mono<ResponseEntity<Void>> updatePetWithFormWithHttpInfo(UpdatePetWithFormRequest requestParameters) throws WebClientResponseException {
          return this.updatePetWithFormWithHttpInfo(requestParameters.petId(), requestParameters.name(), requestParameters.status());
      }

      /**
      * Updates a pet in the store with form data
      * 
         * <p><b>200</b> - Successful operation
         * <p><b>405</b> - Invalid input
         * @param requestParameters The updatePetWithForm request parameters as object
      * @return ResponseSpec
      * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public ResponseSpec updatePetWithFormWithResponseSpec(UpdatePetWithFormRequest requestParameters) throws WebClientResponseException {
         return this.updatePetWithFormWithResponseSpec(requestParameters.petId(), requestParameters.name(), requestParameters.status());
      }

          
    /**
     * Updates a pet in the store with form data
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param petId ID of pet that needs to be updated
     * @param name Updated name of the pet
     * @param status Updated status of the pet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updatePetWithFormRequestCreation(Long petId, String name, String status) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new WebClientResponseException("Missing the required parameter 'petId' when calling updatePetWithForm", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("petId", petId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (name != null)
            formParams.add("name", name);
        if (status != null)
            formParams.add("status", status);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/pet/{petId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Updates a pet in the store with form data
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param petId ID of pet that needs to be updated
     * @param name Updated name of the pet
     * @param status Updated status of the pet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> updatePetWithForm(Long petId, String name, String status) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return updatePetWithFormRequestCreation(petId, name, status).bodyToMono(localVarReturnType);
    }

    /**
     * Updates a pet in the store with form data
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param petId ID of pet that needs to be updated
     * @param name Updated name of the pet
     * @param status Updated status of the pet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> updatePetWithFormWithHttpInfo(Long petId, String name, String status) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return updatePetWithFormRequestCreation(petId, name, status).toEntity(localVarReturnType);
    }

    /**
     * Updates a pet in the store with form data
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param petId ID of pet that needs to be updated
     * @param name Updated name of the pet
     * @param status Updated status of the pet
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updatePetWithFormWithResponseSpec(Long petId, String name, String status) throws WebClientResponseException {
        return updatePetWithFormRequestCreation(petId, name, status);
    }

    public class UploadFileRequest {
        private Long petId;
        private String additionalMetadata;
        private File _file;

        public UploadFileRequest() {}

        public UploadFileRequest(Long petId, String additionalMetadata, File _file) {
            this.petId = petId;
            this.additionalMetadata = additionalMetadata;
            this._file = _file;
        }

        public Long petId() {
            return this.petId;
        }
        public UploadFileRequest petId(Long petId) {
            this.petId = petId;
            return this;
        }

        public String additionalMetadata() {
            return this.additionalMetadata;
        }
        public UploadFileRequest additionalMetadata(String additionalMetadata) {
            this.additionalMetadata = additionalMetadata;
            return this;
        }

        public File _file() {
            return this._file;
        }
        public UploadFileRequest _file(File _file) {
            this._file = _file;
            return this;
        }

    }

      /**
      * uploads an image
      * 
         * <p><b>200</b> - successful operation
         * @param requestParameters The uploadFile request parameters as object
         * @return ModelApiResponse
         * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public Mono<ModelApiResponse> uploadFile(UploadFileRequest requestParameters) throws WebClientResponseException {
          return this.uploadFile(requestParameters.petId(), requestParameters.additionalMetadata(), requestParameters._file());
      }

      /**
      * uploads an image
      * 
         * <p><b>200</b> - successful operation
         * @param requestParameters The uploadFile request parameters as object
         * @return ResponseEntity&lt;ModelApiResponse&gt;
         * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public Mono<ResponseEntity<ModelApiResponse>> uploadFileWithHttpInfo(UploadFileRequest requestParameters) throws WebClientResponseException {
          return this.uploadFileWithHttpInfo(requestParameters.petId(), requestParameters.additionalMetadata(), requestParameters._file());
      }

      /**
      * uploads an image
      * 
         * <p><b>200</b> - successful operation
         * @param requestParameters The uploadFile request parameters as object
      * @return ResponseSpec
      * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public ResponseSpec uploadFileWithResponseSpec(UploadFileRequest requestParameters) throws WebClientResponseException {
         return this.uploadFileWithResponseSpec(requestParameters.petId(), requestParameters.additionalMetadata(), requestParameters._file());
      }

          
    /**
     * uploads an image
     * 
     * <p><b>200</b> - successful operation
     * @param petId ID of pet to update
     * @param additionalMetadata Additional data to pass to server
     * @param _file file to upload
     * @return ModelApiResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec uploadFileRequestCreation(Long petId, String additionalMetadata, File _file) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new WebClientResponseException("Missing the required parameter 'petId' when calling uploadFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("petId", petId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (additionalMetadata != null)
            formParams.add("additionalMetadata", additionalMetadata);
        if (_file != null)
            formParams.add("file", new FileSystemResource(_file));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<ModelApiResponse> localVarReturnType = new ParameterizedTypeReference<ModelApiResponse>() {};
        return apiClient.invokeAPI("/pet/{petId}/uploadImage", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * uploads an image
     * 
     * <p><b>200</b> - successful operation
     * @param petId ID of pet to update
     * @param additionalMetadata Additional data to pass to server
     * @param _file file to upload
     * @return ModelApiResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, File _file) throws WebClientResponseException {
        ParameterizedTypeReference<ModelApiResponse> localVarReturnType = new ParameterizedTypeReference<ModelApiResponse>() {};
        return uploadFileRequestCreation(petId, additionalMetadata, _file).bodyToMono(localVarReturnType);
    }

    /**
     * uploads an image
     * 
     * <p><b>200</b> - successful operation
     * @param petId ID of pet to update
     * @param additionalMetadata Additional data to pass to server
     * @param _file file to upload
     * @return ResponseEntity&lt;ModelApiResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ModelApiResponse>> uploadFileWithHttpInfo(Long petId, String additionalMetadata, File _file) throws WebClientResponseException {
        ParameterizedTypeReference<ModelApiResponse> localVarReturnType = new ParameterizedTypeReference<ModelApiResponse>() {};
        return uploadFileRequestCreation(petId, additionalMetadata, _file).toEntity(localVarReturnType);
    }

    /**
     * uploads an image
     * 
     * <p><b>200</b> - successful operation
     * @param petId ID of pet to update
     * @param additionalMetadata Additional data to pass to server
     * @param _file file to upload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec uploadFileWithResponseSpec(Long petId, String additionalMetadata, File _file) throws WebClientResponseException {
        return uploadFileRequestCreation(petId, additionalMetadata, _file);
    }

    public class UploadFileWithRequiredFileRequest {
        private Long petId;
        private File requiredFile;
        private String additionalMetadata;

        public UploadFileWithRequiredFileRequest() {}

        public UploadFileWithRequiredFileRequest(Long petId, File requiredFile, String additionalMetadata) {
            this.petId = petId;
            this.requiredFile = requiredFile;
            this.additionalMetadata = additionalMetadata;
        }

        public Long petId() {
            return this.petId;
        }
        public UploadFileWithRequiredFileRequest petId(Long petId) {
            this.petId = petId;
            return this;
        }

        public File requiredFile() {
            return this.requiredFile;
        }
        public UploadFileWithRequiredFileRequest requiredFile(File requiredFile) {
            this.requiredFile = requiredFile;
            return this;
        }

        public String additionalMetadata() {
            return this.additionalMetadata;
        }
        public UploadFileWithRequiredFileRequest additionalMetadata(String additionalMetadata) {
            this.additionalMetadata = additionalMetadata;
            return this;
        }

    }

      /**
      * uploads an image (required)
      * 
         * <p><b>200</b> - successful operation
         * @param requestParameters The uploadFileWithRequiredFile request parameters as object
         * @return ModelApiResponse
         * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public Mono<ModelApiResponse> uploadFileWithRequiredFile(UploadFileWithRequiredFileRequest requestParameters) throws WebClientResponseException {
          return this.uploadFileWithRequiredFile(requestParameters.petId(), requestParameters.requiredFile(), requestParameters.additionalMetadata());
      }

      /**
      * uploads an image (required)
      * 
         * <p><b>200</b> - successful operation
         * @param requestParameters The uploadFileWithRequiredFile request parameters as object
         * @return ResponseEntity&lt;ModelApiResponse&gt;
         * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public Mono<ResponseEntity<ModelApiResponse>> uploadFileWithRequiredFileWithHttpInfo(UploadFileWithRequiredFileRequest requestParameters) throws WebClientResponseException {
          return this.uploadFileWithRequiredFileWithHttpInfo(requestParameters.petId(), requestParameters.requiredFile(), requestParameters.additionalMetadata());
      }

      /**
      * uploads an image (required)
      * 
         * <p><b>200</b> - successful operation
         * @param requestParameters The uploadFileWithRequiredFile request parameters as object
      * @return ResponseSpec
      * @throws WebClientResponseException if an error occurs while attempting to invoke the API
      */
      public ResponseSpec uploadFileWithRequiredFileWithResponseSpec(UploadFileWithRequiredFileRequest requestParameters) throws WebClientResponseException {
         return this.uploadFileWithRequiredFileWithResponseSpec(requestParameters.petId(), requestParameters.requiredFile(), requestParameters.additionalMetadata());
      }

          
    /**
     * uploads an image (required)
     * 
     * <p><b>200</b> - successful operation
     * @param petId ID of pet to update
     * @param requiredFile file to upload
     * @param additionalMetadata Additional data to pass to server
     * @return ModelApiResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec uploadFileWithRequiredFileRequestCreation(Long petId, File requiredFile, String additionalMetadata) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new WebClientResponseException("Missing the required parameter 'petId' when calling uploadFileWithRequiredFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requiredFile' is set
        if (requiredFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'requiredFile' when calling uploadFileWithRequiredFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("petId", petId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (additionalMetadata != null)
            formParams.add("additionalMetadata", additionalMetadata);
        if (requiredFile != null)
            formParams.add("requiredFile", new FileSystemResource(requiredFile));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<ModelApiResponse> localVarReturnType = new ParameterizedTypeReference<ModelApiResponse>() {};
        return apiClient.invokeAPI("/fake/{petId}/uploadImageWithRequiredFile", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * uploads an image (required)
     * 
     * <p><b>200</b> - successful operation
     * @param petId ID of pet to update
     * @param requiredFile file to upload
     * @param additionalMetadata Additional data to pass to server
     * @return ModelApiResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ModelApiResponse> uploadFileWithRequiredFile(Long petId, File requiredFile, String additionalMetadata) throws WebClientResponseException {
        ParameterizedTypeReference<ModelApiResponse> localVarReturnType = new ParameterizedTypeReference<ModelApiResponse>() {};
        return uploadFileWithRequiredFileRequestCreation(petId, requiredFile, additionalMetadata).bodyToMono(localVarReturnType);
    }

    /**
     * uploads an image (required)
     * 
     * <p><b>200</b> - successful operation
     * @param petId ID of pet to update
     * @param requiredFile file to upload
     * @param additionalMetadata Additional data to pass to server
     * @return ResponseEntity&lt;ModelApiResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ModelApiResponse>> uploadFileWithRequiredFileWithHttpInfo(Long petId, File requiredFile, String additionalMetadata) throws WebClientResponseException {
        ParameterizedTypeReference<ModelApiResponse> localVarReturnType = new ParameterizedTypeReference<ModelApiResponse>() {};
        return uploadFileWithRequiredFileRequestCreation(petId, requiredFile, additionalMetadata).toEntity(localVarReturnType);
    }

    /**
     * uploads an image (required)
     * 
     * <p><b>200</b> - successful operation
     * @param petId ID of pet to update
     * @param requiredFile file to upload
     * @param additionalMetadata Additional data to pass to server
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec uploadFileWithRequiredFileWithResponseSpec(Long petId, File requiredFile, String additionalMetadata) throws WebClientResponseException {
        return uploadFileWithRequiredFileRequestCreation(petId, requiredFile, additionalMetadata);
    }
}
