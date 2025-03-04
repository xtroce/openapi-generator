/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.13.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * UserApi.h
 *
 * 
 */

#ifndef UserApi_H_
#define UserApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "User.h"
#include <string>
#include <vector>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  UserApiException: public std::exception
{
public:
    UserApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace UserApiResources {
/// <summary>
/// Create user
/// </summary>
/// <remarks>
/// This can only be done by the logged in user.
/// </remarks>
class  UserResource: public restbed::Resource
{
public:
    UserResource(const std::string& context = "/v2");
    virtual ~UserResource() = default;

    UserResource(
        const UserResource& other) = default; // copy constructor
    UserResource(UserResource&& other) noexcept = default; // move constructor

    UserResource& operator=(const UserResource& other) = default; // copy assignment
    UserResource& operator=(UserResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<int(
        User & user)> handler_POST_func =
            [](User &) -> int
                { throw UserApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual int handler_POST(
        User & user);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleUserApiException(const UserApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_POST_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Creates list of users with given input array
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  UserCreateWithArrayResource: public restbed::Resource
{
public:
    UserCreateWithArrayResource(const std::string& context = "/v2");
    virtual ~UserCreateWithArrayResource() = default;

    UserCreateWithArrayResource(
        const UserCreateWithArrayResource& other) = default; // copy constructor
    UserCreateWithArrayResource(UserCreateWithArrayResource&& other) noexcept = default; // move constructor

    UserCreateWithArrayResource& operator=(const UserCreateWithArrayResource& other) = default; // copy assignment
    UserCreateWithArrayResource& operator=(UserCreateWithArrayResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<int(
        std::vector<User> & user)> handler_POST_func =
            [](std::vector<User> &) -> int
                { throw UserApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual int handler_POST(
        std::vector<User> & user);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleUserApiException(const UserApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_POST_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Creates list of users with given input array
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  UserCreateWithListResource: public restbed::Resource
{
public:
    UserCreateWithListResource(const std::string& context = "/v2");
    virtual ~UserCreateWithListResource() = default;

    UserCreateWithListResource(
        const UserCreateWithListResource& other) = default; // copy constructor
    UserCreateWithListResource(UserCreateWithListResource&& other) noexcept = default; // move constructor

    UserCreateWithListResource& operator=(const UserCreateWithListResource& other) = default; // copy assignment
    UserCreateWithListResource& operator=(UserCreateWithListResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<int(
        std::vector<User> & user)> handler_POST_func =
            [](std::vector<User> &) -> int
                { throw UserApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual int handler_POST(
        std::vector<User> & user);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleUserApiException(const UserApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_POST_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Delete user
/// </summary>
/// <remarks>
/// This can only be done by the logged in user.
/// </remarks>
class  UserUsernameResource: public restbed::Resource
{
public:
    UserUsernameResource(const std::string& context = "/v2");
    virtual ~UserUsernameResource() = default;

    UserUsernameResource(
        const UserUsernameResource& other) = default; // copy constructor
    UserUsernameResource(UserUsernameResource&& other) noexcept = default; // move constructor

    UserUsernameResource& operator=(const UserUsernameResource& other) = default; // copy assignment
    UserUsernameResource& operator=(UserUsernameResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<int(
        std::string & username)> handler_DELETE_func =
            [](std::string &) -> int
                { throw UserApiException(501, "Not implemented"); };

    std::function<std::pair<int, User>(
        std::string & username)> handler_GET_func =
            [](std::string &) -> std::pair<int, User>
                { throw UserApiException(501, "Not implemented"); };

    std::function<int(
        std::string & username, User & user)> handler_PUT_func =
            [](std::string &, User &) -> int
                { throw UserApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual int handler_DELETE(
        std::string & username);

    virtual std::pair<int, User> handler_GET(
        std::string & username);
    virtual int handler_PUT(
        std::string & username, User & user);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleUserApiException(const UserApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_DELETE_internal(const std::shared_ptr<restbed::Session> session);
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
    void handler_PUT_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Logs user into the system
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  UserLoginResource: public restbed::Resource
{
public:
    UserLoginResource(const std::string& context = "/v2");
    virtual ~UserLoginResource() = default;

    UserLoginResource(
        const UserLoginResource& other) = default; // copy constructor
    UserLoginResource(UserLoginResource&& other) noexcept = default; // move constructor

    UserLoginResource& operator=(const UserLoginResource& other) = default; // copy assignment
    UserLoginResource& operator=(UserLoginResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        std::string & username, std::string & password)> handler_GET_func =
            [](std::string &, std::string &) -> std::pair<int, std::string>
                { throw UserApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::string> handler_GET(
        std::string & username, std::string & password);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleUserApiException(const UserApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Logs out current logged in user session
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  UserLogoutResource: public restbed::Resource
{
public:
    UserLogoutResource(const std::string& context = "/v2");
    virtual ~UserLogoutResource() = default;

    UserLogoutResource(
        const UserLogoutResource& other) = default; // copy constructor
    UserLogoutResource(UserLogoutResource&& other) noexcept = default; // move constructor

    UserLogoutResource& operator=(const UserLogoutResource& other) = default; // copy assignment
    UserLogoutResource& operator=(UserLogoutResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<int(
        )> handler_GET_func =
            []() -> int
                { throw UserApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual int handler_GET(
        );


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleUserApiException(const UserApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace UserApiResources */

using UserApiUserResource [[deprecated]] = UserApiResources::UserResource;
using UserApiUserCreateWithArrayResource [[deprecated]] = UserApiResources::UserCreateWithArrayResource;
using UserApiUserCreateWithListResource [[deprecated]] = UserApiResources::UserCreateWithListResource;
using UserApiUserUsernameResource [[deprecated]] = UserApiResources::UserUsernameResource;
using UserApiUserLoginResource [[deprecated]] = UserApiResources::UserLoginResource;
using UserApiUserLogoutResource [[deprecated]] = UserApiResources::UserLogoutResource;

//
// The restbed service to actually implement the REST server
//
class  UserApi
{
public:
    explicit UserApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~UserApi();

    std::shared_ptr<UserApiResources::UserResource> getUserResource();
    std::shared_ptr<UserApiResources::UserCreateWithArrayResource> getUserCreateWithArrayResource();
    std::shared_ptr<UserApiResources::UserCreateWithListResource> getUserCreateWithListResource();
    std::shared_ptr<UserApiResources::UserUsernameResource> getUserUsernameResource();
    std::shared_ptr<UserApiResources::UserLoginResource> getUserLoginResource();
    std::shared_ptr<UserApiResources::UserLogoutResource> getUserLogoutResource();

    void setResource(std::shared_ptr<UserApiResources::UserResource> resource);
    void setResource(std::shared_ptr<UserApiResources::UserCreateWithArrayResource> resource);
    void setResource(std::shared_ptr<UserApiResources::UserCreateWithListResource> resource);
    void setResource(std::shared_ptr<UserApiResources::UserUsernameResource> resource);
    void setResource(std::shared_ptr<UserApiResources::UserLoginResource> resource);
    void setResource(std::shared_ptr<UserApiResources::UserLogoutResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setUserApiUserResource(std::shared_ptr<UserApiResources::UserResource> spUserApiUserResource);
    [[deprecated("use setResource()")]]
    virtual void setUserApiUserCreateWithArrayResource(std::shared_ptr<UserApiResources::UserCreateWithArrayResource> spUserApiUserCreateWithArrayResource);
    [[deprecated("use setResource()")]]
    virtual void setUserApiUserCreateWithListResource(std::shared_ptr<UserApiResources::UserCreateWithListResource> spUserApiUserCreateWithListResource);
    [[deprecated("use setResource()")]]
    virtual void setUserApiUserUsernameResource(std::shared_ptr<UserApiResources::UserUsernameResource> spUserApiUserUsernameResource);
    [[deprecated("use setResource()")]]
    virtual void setUserApiUserLoginResource(std::shared_ptr<UserApiResources::UserLoginResource> spUserApiUserLoginResource);
    [[deprecated("use setResource()")]]
    virtual void setUserApiUserLogoutResource(std::shared_ptr<UserApiResources::UserLogoutResource> spUserApiUserLogoutResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<UserApiResources::UserResource> m_spUserResource;
    std::shared_ptr<UserApiResources::UserCreateWithArrayResource> m_spUserCreateWithArrayResource;
    std::shared_ptr<UserApiResources::UserCreateWithListResource> m_spUserCreateWithListResource;
    std::shared_ptr<UserApiResources::UserUsernameResource> m_spUserUsernameResource;
    std::shared_ptr<UserApiResources::UserLoginResource> m_spUserLoginResource;
    std::shared_ptr<UserApiResources::UserLogoutResource> m_spUserLogoutResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* UserApi_H_ */

