import React, { Component } from 'react';
import $ from 'jquery';
import InputBar from './components/InputBar';
import RunePages from './components/RunePages';

class App extends Component {
    constructor(props){
        super(props);
        this.state = {
            summoner:'',
            lastPlayedChamp:'',
            runeData:{}
        };
        this.handleSummonerName = this.handleSummonerName.bind(this);
        this.checkForData = this.checkForData.bind(this);
    }

    getRuneData(e) {
        $.ajax({
            url:'http://localhost:8080/runes/' + this.state.summoner,
            type: 'GET',
            cache: false,
            success: function(data) {
                this.setState({runeData:data},
                function() {
                    console.log(this.state);
                });
            }.bind(this),
            error: function(xhr, status, err) {
                console.log(err);
            }.bind(this)
        });
    }

    getLastPlayed(e) {
        $.ajax({
            url:'http://localhost:8080/match-history/last-played/' + this.state.summoner,
            type: 'GET',
            cache: false,
            success: function(data) {
                this.setState({lastPlayedChamp:data}),
                function(){
                    console.log(this.state);
                }
            }.bind(this),
            error: function(xhr, status, err) {
                console.log(err);
            }.bind(this)
        });
    }

    handleSummonerName(inputSummoner) {
        this.setState({summoner:inputSummoner},
        function() {
            this.getRuneData();
            this.getLastPlayed();
        });
    }

    checkForData(input) {
        if (input == null) {
            return false;
        }
        return true;
    }

    render() {
        const runePagesExist = this.checkForData(this.state.runeData.runePages);
        var currentKey;
        if (runePagesExist) {
            this.state.runeData.runePages.forEach(function(page) {
                if (page.current) {
                    currentKey = page.id;
                }
            });
        }


        return (
            <div className="App">
                <InputBar handleSummonerName={this.handleSummonerName} />
                <div style={{color: "gainsboro"}}>
                    <p>Last Played Champ: {this.state.lastPlayedChamp}</p>
                </div>
                {runePagesExist &&
                    <RunePages currentKey={currentKey} data={this.state.runeData}  />
                }
            </div>
        );
    }
}

export default App;
