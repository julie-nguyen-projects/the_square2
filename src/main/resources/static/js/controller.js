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
            $('tbody').append('<tr>' +
                '<td>'+item.firstName+'</td>' +
                '<td>'+item.lastName+'</td>' +
                '<td>'+item.city.name +'</td>' +
                '<td>'+item.birthday+'</td>' +
                '</tr>')
        });
    }

    $("#btnId").click(function(event){
        event.preventDefault();

        // Open Bootstrap Modal
        openModel();
        // Get data from Server
        ajaxGet();
    });

    // Open Bootstrap Modal
    function openModel(){
        $("#modalId").modal();
    }

// DO GET
    function ajaxGet(){
        $.ajax({
            type : "GET",
            url : url + "/users",
            success: function(data){
                // fill data to Modal Body
                fillData(data);
            },
            error : function(e) {
                fillData(null);
            }
        });
    }

    function fillData(data){
        console.log(data);
        if(data!=null){
            $(".modal-body #firstName").text(data[0].firstName);
        }else{
            $(".modal-body #firstName").text("Can Not Get Data from Server!");
        }
    }

    getUsers();
});