function searchAlumni(){
    var searchBar = document.getElementById('searchBar');
    var filter = searchBar.value.toUpperCase();
    var batchLabel = document.getElementsByClassName("batchLabel");
    var alumniContainer = document.getElementsByClassName("alumniContainer");
    for(var j=0; j < alumniContainer.length;j++){
        var mycolumn = alumniContainer[j].getElementsByClassName("column");
        var c=0;
        for(var i=0; i<mycolumn.length; i++){
            var name, branch, batch;
            name = mycolumn[i].getElementsByClassName("key")[0];
            branch = mycolumn[i].getElementsByClassName("key")[1];
            batch = mycolumn[i].getElementsByClassName("key")[2];

            var val1, val2, val3;
            val1 = name.textContent || name.innerHTML;
            val2 = branch.textContent || branch.innerHTML;
            if(batch){
            val3 = batch.textContent || batch.innerHTML;
            }else{ val3 = val1;}
            
            if((val1.toUpperCase().indexOf(filter) > -1)||(val2.toUpperCase().indexOf(filter) > -1)||(val3.toUpperCase().indexOf(filter) > -1)){
                mycolumn[i].style.display = "";
                c++;
            }else{
                mycolumn[i].style.display = "none";
            }        
        }
        if(c==0){ 
            batchLabel[j].style.display = "none"; 
            alumniContainer[j].style.display = "none";
        }
        else{
            batchLabel[j].style.display = ""; 
            alumniContainer[j].style.display = "";
        
        }
    }
}    
    
//    var tr = myTable.getElementsByTagName('tr');
//    for(var i=1; i<tr.length; i++)
//    {
//        var td1 = tr[i].getElementsByTagName('td')[1];
//        var td2 = tr[i].getElementsByTagName('td')[2];
//
//        if(td2){
//            var textVal1 = td1.textContent || td1.innerHTML;
//            var textVal2 = td2.textContent || td2.innerHTML;
//
//            if((textVal1.toUpperCase().indexOf(filter) > -1)||(textVal2.toUpperCase().indexOf(filter) > -1))    
//            {
//                tr[i].style.display = "";
//            }else{
//                tr[i].style.display = "none";
//            }
//        }
//    }

    