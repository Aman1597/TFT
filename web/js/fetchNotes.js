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