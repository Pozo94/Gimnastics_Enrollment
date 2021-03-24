import React, {Component} from "react";
import './App.css';
import {getAllParticipants} from "./client";


class App extends Component {
    state = {
        participants: []
    }

    componentDidMount() {
      this.fetchParticipants();
    }


  fetchParticipants = () => {
        getAllParticipants()
            .then(res => res.json()
            .then(participants => {

              this.setState({participants});

                }));
    }

    render() {
        const {participants} = this.state;
        if (participants && participants.length) {
            console.log(participants)
            return participants.map((participant, key) => {

                    return (

                        <div key={key}>
                            <h2>
                              {participant.participantID}
                            </h2>
                            <p>
                                {participant.firstName}
                            </p>
                            <p>
                                {participant.lastName}
                            </p>
                        </div>
                    )

                }
            )

        }
      return <h1>participants</h1>;


    }

}

export default App;
