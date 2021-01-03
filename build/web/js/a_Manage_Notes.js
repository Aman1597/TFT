    function getSub1(dept){
        $.ajax({

            url: 'ResponseSub.jsp',
            type: 'POST',
            data: { datapost : dept},
            success: function(result){
                $('#sub').html(result);
            }
        });
    }
    function getSub2(dept){
        $.ajax({

            url: 'ResponseSub.jsp',
            type: 'POST',
            data: { datapost : dept},
            success: function(result){
                $('#sub2').html(result);
            }
        });
    }
    function getNotes(sub){
        $.ajax({

            url: 'ResponseNotes.jsp',
            type: 'POST',
            data: { datapost : sub},
            success: function(result){
                $('#gr1').html(result);
            }
        });
    }