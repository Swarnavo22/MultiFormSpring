            var div1=document.getElementById("div1");
            var div2=document.getElementById("div2");
            var div3=document.getElementById("div3");

            var next1=document.getElementById("next1");
            var back1=document.getElementById("back1");
            var next2=document.getElementById("next2");
            var back2=document.getElementById("back2");

            var namee=document.getElementById("name");
            var dob=document.getElementById("dob");
            var phone=document.getElementById("phone");
            var gender=document.getElementById("gen");
            var tenth = document.getElementById("tenth");
            var twelveth = document.getElementById("twelveth");
            var ug = document.getElementById("ug");
            var pg = document.getElementById("pg");

            var progress=document.getElementById("progress");

            next1.onclick = function(){
                //console.log(namee.value);
                if(!namee.value){
                    alert("Please Enter Your Name!");
                    return;
                }
                if(!dob.value){
                    alert("Please Enter Your DOB!");
                    return;
                }
                if(!phone.value){
                    alert("Please Enter Your Contact Number!");
                    return;
                }
                if(!gender.value){
                    console.log(gender.value);
                    alert("Please Enter Your Gender!");
                    return;
                }
                div1.style.left="-450px";
                div2.style.left="40px";
                progress.style.width= "240px";
            }

            back1.onclick = function(){
                div1.style.left="40px";
                div2.style.left="450px";
                progress.style.width= "120px";
            }

            next2.onclick = function(){
                let f1 = parseInt(tenth.value);
                if(!tenth.value||f1<0||f1>100){
                    alert("Enter valid 10th marks!");
                    return; 
                }
                let f2 = parseInt(twelveth.value);
                if(!twelveth.value||f2<0||f2>100){
                    alert("Enter valid 12th marks!");
                    return; 
                }
                let f3 = parseInt(ug.value);
                if(!ug.value||f3<0&&f3>100){
                    alert("Enter valid ug marks!");
                    return; 
                }
                let f4 = parseInt(tenth.value);
                if(!pg.value||f4<0&&f4>100){
                    alert("Enter valid pg marks!");
                    return; 
                }
                div2.style.left="-450px";
                div3.style.left="40px";
                progress.style.width= "360px";

            }

            back2.onclick = function(){
                div2.style.left="40px";
                div3.style.left="450px";
                progress.style.width= "240px";
            }