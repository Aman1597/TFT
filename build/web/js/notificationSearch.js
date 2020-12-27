function searchNotification(){
    var searchBar = document.getElementById('searchBar');
    var filter = searchBar.value.toUpperCase();
    var myTable = document.getElementById('table');
    var tr = myTable.getElementsByTagName('tr');
    for(var i=1; i<tr.length; i++)
    {
        var sno = tr[i].getElementsByTagName('td')[0];
        var td1 = tr[i].getElementsByTagName('td')[1];
        var td2 = tr[i].getElementsByTagName('td')[2];

        if(td2){
            var Val0 = sno.textContent || sno.innerHTML;
            var Val1 = td1.textContent || td1.innerHTML;
            var Val2 = td2.textContent || td2.innerHTML;

            if((Val0.toUpperCase().indexOf(filter) > -1)||(Val1.toUpperCase().indexOf(filter) > -1)||(Val2.toUpperCase().indexOf(filter) > -1))    
            {
                tr[i].style.display = "";
            }else{
                tr[i].style.display = "none";
            }
        }
    }    
}