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
    
   