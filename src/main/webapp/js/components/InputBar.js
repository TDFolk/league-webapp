import React, { Component } from 'react';
import { FormControl } from 'react-bootstrap';
import { FormGroup } from 'react-bootstrap';
import { ControlLabel } from 'react-bootstrap';
import { Form } from 'react-bootstrap';

class InputBar extends Component {
    constructor(props) {
        super(props);
        this.state = {
            summoner:''
        };
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit(e) {
        e.preventDefault();
        if (this.input.value === '') {
            alert('Summoner name is required')
        }
        else {
            this.setState({summoner:this.input.value},
            function() {
                this.props.handleSummonerName(this.state.summoner);
                console.log(this.state.summoner);
            });
        }
    }


    render() {
        var formGroupStyle = {
            textAlign: "center",
            marginTop: "30px",
            color: "gainsboro",
            fontSize: "20px"
        }

        var formControlStyle = {
            width: "50%",
            margin: "0 auto",
            borderColor: "steelblue",
            backgroundColor: "gainsboro",
            color: "black"
        }
        return (
            <Form onSubmit={this.handleSubmit}>
                <FormGroup style={formGroupStyle}>
                    <ControlLabel>Enter Summoner Name</ControlLabel>
                    <FormControl
                        style={formControlStyle}
                        componentClass='input'
                        type='text'
                        placeholder='Summoner'
                        inputRef={(ref) => {this.input = ref}}
                    />
                </FormGroup>
            </Form>
        );
    }
}

export default InputBar;
