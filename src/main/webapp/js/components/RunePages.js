import React, { Component } from 'react';
import RuneTab from './RuneTab';

import { Tab } from 'react-bootstrap';
import { Tabs } from 'react-bootstrap';
import { TabStyleNormCSS } from '../styles/tabStyle';
import { TabStyleCurrentCSS } from '../styles/tabStyle';

import { ResponsiveEmbed } from 'react-bootstrap';

import { Jumbotron } from 'react-bootstrap';

class RunePages extends Component {
    constructor(props) {
        super(props);
        this.state = {
            key: this.props.currentKey
        };
        this.handleSelect = this.handleSelect.bind(this);
    }

    handleSelect(input) {
        this.setState({key:input});
    }



    render() {
        var contentStyle = {
            float: "right",
            width: "42%",
            height: "auto",
            margin: "0 10% 0 0",
            paddingTop: "30px"
        }
        var statStyle;

        var statStyleNorm = {
            float: "left",
            width: "20%",
            margin: "0 0 0 15%",
            paddingTop: "30px",
            color: "gainsboro"
        }

        var statStyleCurrent = {
            float: "left",
            width: "20%",
            margin: "0 0 0 15%",
            paddingTop: "30px",
            color: "lightgreen"
        }

        return(
            <Tabs activeKey={this.state.key} onSelect={this.handleSelect} id="rune-tab">
                {this.props.data.runePages.map(function(runePage) {
                    var isCurrent = false;
                    statStyle = statStyleNorm;
                    if (runePage.current) {
                        isCurrent = true;
                        statStyle = statStyleCurrent;
                    }
                    return (
                        <Tab
                            key={runePage.id}
                            eventKey={runePage.id}
                            title={runePage.name}
                        >
                            <section style={contentStyle}>
                                <ResponsiveEmbed a16by9>
                                  <embed type="image/jpg" src="images/space_1.jpg" />
                                </ResponsiveEmbed>
                            </section>
                            <aside style={statStyle}>
                                {Object.keys(runePage.runeStatTotals).map(function(runeStat) {
                                    return (
                                        <p key={runeStat}>
                                            {runeStat}: {runePage.runeStatTotals[runeStat]}
                                        </p>
                                    );
                                })}
                            </aside>
                        </Tab>
                    );
                })}
            <style>{TabStyleCSS}</style>
            </Tabs>

        );
    }
}

export default RunePages;
