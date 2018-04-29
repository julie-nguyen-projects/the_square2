$(document).ready(function () {
    var url = window.location;

    function getUsers() {
        $.ajax({
            type : "GET",
            url : url + "/users",
            success: function(data){
                fillUsersArray(data);
            },
            error : function(e) {
                fillUsersArray(null);
                console.log(e);
            }
        });
    }

    function fillUsersArray(data) {
        data.forEach(function(item){
            $('#usersTable').children('tbody').append('<tr>' +
                '<td>'+item.firstName+'</td>' +
                '<td>'+item.lastName+'</td>' +
                '<td>'+item.city.name +'</td>' +
                '</tr>')
        });
    }

    function getUsersWithCommonPoints() {
        $.ajax({
            type : "GET",
            url : url + "/users-common-point",
            success: function(data){
                fillUsersCommonPointsArray(data);
            },
            error : function(e) {
                fillUsersCommonPointsArray(null);
                console.log(e);
            }
        });
    }



    function fillUsersCommonPointsArray(data) {
        data.forEach(function(item){
            $('#usersCommonPoints').children('tbody').append('<tr>' +
                '<td>'+item.firstName+'</td>' +
                '<td>'+item.lastName+'</td>' +
                '</tr>')
        });
    }

    function getFriendsOfFriends() {
        $.ajax({
            type : "GET",
            url : url + "/friends-friends",
            success: function(data){
                fillFriendsArray(data);
            },
            error : function(e) {
                fillFriendsArray(null);
                console.log(e);
            }
        });
    }

    function fillFriendsArray(data) {
        data.forEach(function(item){
            $('#friendsoffriends').children('tbody').append('<tr>' +
                '<td>'+item.firstName+'</td>' +
                '<td>'+item.lastName+'</td>' +
                '</tr>')
        });
    }

    function getLinksBetweenUsersAndCompanies() {
        $.ajax({
            type : "GET",
            url : url + "/links",
            success: function(data){
                fillUsersCompaniesArray(data);
            },
            error : function(e) {
                fillUsersCompaniesArray(null);
                console.log(e);
            }
        });
    }

    function fillUsersCompaniesArray(data) {
        data.forEach(function(item){
            $('#users-companies').children('tbody').append('<tr>' +
                '<td class="col-xs-3 col-lg-3">'+item.firstName+' ' + item.lastName + '</td>' +
                '<td class="col-xs-3 col-lg-3">'+item.jobPropositionName+'</td>' +
                '<td class="col-xs-2 col-lg-2">'+item.companyName+'</td>' +
                '<td class="col-xs-2 col-lg-2">'+item.nbOfSkillsInCommon+'</td>' +
                '<td class="col-xs-2 col-lg-2">'+item.nbOfActDomInCommon+'</td>' +
                '</tr>')
        });
    }

    getUsers();
    getUsersWithCommonPoints();
    getFriendsOfFriends();
    getLinksBetweenUsersAndCompanies();
});