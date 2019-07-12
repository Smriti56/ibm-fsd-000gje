
function assign()
{
    let teacher=document.getElementById("teacher").value;
    //console.log(teacher);
    //localStorage.setItem("trainer",teacher)
    let cls=document.getElementById("class").value;
    //console.log(cls);
    //localStorage.setItem("class",cls)
    let tm=document.getElementById("time").value;
    //console.log(tm);
    //localStorage.setItem("time",tm)

    let sub=document.getElementById("subj").value;

    //console.log(sub)
    
    if(tm=='t1')
    {
        if(cls=='A')
        {
            document.getElementById('att1').value=teacher;
            document.getElementById('ats1').value=sub;
        }
        else if(cls=='B')
        {
            document.getElementById('btt1').value=teacher;
            document.getElementById('bts1').value=sub;
        }
    }
    else if(tm=='t2')
    {
        if(cls=='A')
        {
            document.getElementById('att2').value=teacher;
            document.getElementById('ats2').value=sub;
        }
        else if(cls=='B')
        {
            document.getElementById('btt2').value=teacher;
            document.getElementById('bts2').value=sub;
        }
    }
    else if(tm=='t3')
    {
        if(cls=='A')
        {
            document.getElementById('att3').value=teacher;
            document.getElementById('ats3').value=sub;
        }
        else if(cls=='B')
        {
            document.getElementById('btt3').value=teacher;
            document.getElementById('bts3').value=sub;
        }
    }
    else if (tm=='t4')
    {
        if(cls=='A')
        {
            document.getElementById('att4').value=teacher;
            document.getElementById('ats4').value=sub;
        }
        else if(cls=='B')
        {
            document.getElementById('btt4').value=teacher;
            document.getElementById('bts4').value=sub;
        }
    }
    // let subs= document.getElementsByName("sub");
    
    // subs.forEach((e)=>{
    //     if(e.checked){
    //         console.log(e.value);
    //     }
    // });
   // console.log(sub);
    
}
