import React, { Component } from 'react';

import { Tab } from 'react-bootstrap';
import { TabContent } from 'react-bootstrap';
import { TabPane } from 'react-bootstrap';
import { Nav } from 'react-bootstrap';
import { NavItem } from 'react-bootstrap';
import { Row } from 'react-bootstrap';
import { Col } from 'react-bootstrap';



class RuneTab extends Component {
    // <div style={{width: 650, height: 'auto'}}>
    //     <ResponsiveEmbed a16by9>
    //         <embed type="image/jpg" src="images/space_1.jpg" />
    //     </ResponsiveEmbed>
    // </div>
    render() {
        return(
            <Tab eventKey={this.props.page.id} title={this.props.page.name}>
                tab content
            </Tab>
        );
    }
}

export default RuneTab;
