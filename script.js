
    function calculateResult()
    {
        let team1Name = document.getElementById("team1Name").value;
        let team2Name = document.getElementById("team2Name").value;
        let team1Score = document.getElementById("team1Score").value;
        let team2Score = document.getElementById("team2Score").value;
        let result = document.getElementById("result");

        if (team1Name == team2Name){
            alert("Team names cannot be same");
            return;
        }

        var team1ScoreArr = team1Score.split('/');
        var team2ScoreArr = team2Score.split('/');

        if(isNaN(team1ScoreArr[0]) || isNaN(team1ScoreArr[1]) || isNaN(team2ScoreArr[0]) || isNaN(team2ScoreArr[1])){
            alert("Score must be a number");
            return;
        }

        if(team1ScoreArr[1]>10 || team2ScoreArr[1]>10){
            alert("Wickets cannot be more then 10");
            return;
        }

        if(team1ScoreArr[0]>team2ScoreArr[0]){
            result.innerHTML = (team1Name) + "winns by"+((team1ScoreArr[0])-(team2ScoreArr)[0])+"runs";
        }
        else{
            result.innerHTML=team2Name+" Wins by "+(team2ScoreArr[0]-team1ScoreArr[0])+" runs";
        }

    }