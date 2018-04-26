$(document).ready(function () {
    var url = window.location;

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

});