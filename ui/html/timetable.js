
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
            if(localStorage.getItem("att1")==undefined)
            {
            document.getElementById('att1').value=teacher;
            document.getElementById('ats1').value=sub;
            localStorage.setItem("att1","filled");
            }
            else
            {
                alert("Already filled");
            }
        }
        else if(cls=='B')
        {
            if(localStorage.getItem("btt1")==undefined)
            {
                document.getElementById('btt1').value=teacher;
                document.getElementById('bts1').value=sub;
                localStorage.setItem("btt1","filled");
            }
            else
            {
                alert("Already filled");
            }
        }
    }
    else if(tm=='t2')
    {
        if(cls=='A')
        {
            if(localStorage.getItem("att2")==undefined){
                document.getElementById('att2').value=teacher;
                document.getElementById('ats2').value=sub;
                localStorage.setItem("att2","filled");

            }
            else
            {
                alert("Already filled");
            }
           
        }
        else if(cls=='B')
        {
            if(localStorage.getItem("btt2")==undefined){
            document.getElementById('btt2').value=teacher;
            document.getElementById('bts2').value=sub;
            localStorage.setItem("btt2","filled");
            }
            else
            {
                alert("Already filled");
            }
        }
    }
    else if(tm=='t3')
    {
        if(cls=='A')
        {
            if(localStorage.getItem("att3")==undefined){
            document.getElementById('att3').value=teacher;
            document.getElementById('ats3').value=sub;
            localStorage.setItem("att3","filled");
            }
            else
            {
                alert("Already filled");
            }
        }
        else if(cls=='B')
        {
            if(localStorage.getItem("btt3")==undefined){
            document.getElementById('btt3').value=teacher;
            document.getElementById('bts3').value=sub;
            localStorage.setItem("btt3","filled");
            }
            else
            {
                alert("Already filled");
            }
        }
    }
    else if (tm=='t4')
    {
        if(cls=='A')
        {
            if(localStorage.getItem("att4")==undefined){
            document.getElementById('att4').value=teacher;
            document.getElementById('ats4').value=sub;
            localStorage.setItem("att4","filled");
            }
            else
            {
                alert("Already filled");
            }
        }
        else if(cls=='B')
        {
            if(localStorage.getItem("btt4")==undefined){
            document.getElementById('btt4').value=teacher;
            document.getElementById('bts4').value=sub;
            localStorage.setItem("btt4","filled");
            }
            else
            {
                alert("Already filled");
            }
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
