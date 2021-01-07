function searchNotes(){
    var searchBar = document.getElementById('searchBar');
    var filter = searchBar.value.toUpperCase();
    var tr = document.getElementsByClassName("tr") ;
    for(var i=0; i<tr.length; i++)
    {
        var c1=0;
        var keys = tr[i].getElementsByClassName("key");
        for(var k=0; k<keys.length; k++){
            var curkey = keys[k].textContent || keys[k].innerHTML;
            if( curkey.toUpperCase().indexOf(filter) > -1 ){
                c1++;
                break;
            }
        }
        if(c1==0){
            tr[i].style.display = "none";
        }
        else{
            tr[i].style.display = "";
        }
    }    
}
