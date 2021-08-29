import React from 'react';

class PostRequest extends React.Component {
    constructor(props) {
        super(props);

	this.string1 = React.createRef();
	this.string2 = React.createRef();

        this.state = {
            editDistance: null
        };
    }

   calcEditDistance = () => {
	// Simple POST request with a JSON body using fetch
        const requestOptions = {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ 'string1': this.string1.current.value, 'string2': this.string2.current.value})
        };
        fetch('/editdistance', requestOptions)
            .then(response => response.json())
            .then(data => this.setState({ editDistance: data.distance }));
    }

    render() {
        const { editDistance } = this.state;
        return (
            <div className="card text-center m-3">
                <h5 className="card-header">Calculate Edit Distance Between Two Strings</h5>
		<p></p>
		<p>Enter string 1:  <input id="input1" ref={this.string1}/></p>
		<p>Enter string 2:  <input id="input2" ref={this.string2}/></p>
		<p><button onClick={this.calcEditDistance} id="calculateEditDistanceBtn">Calculate Edit Distance</button></p>
                <div className="card-body">
                    Edit Distance between the two strings is: {editDistance}
                </div>
            </div>
        );
    }
}

export { PostRequest }; 