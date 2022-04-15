import * as React from "react";
import Progress from "./Progress";

/* global require */

export interface AppProps {
  title: string;
  isOfficeInitialized: boolean;
}

export interface AppState {
  body: string;
}

export default class App extends React.Component<AppProps, AppState> {
  constructor(props, context) {
    super(props, context);
    this.state = {
      body: "",
    };
  }

  async componentDidMount() {
    await Office.context.mailbox.item.body.getAsync("text", function (async) {
      //this.setState({ body: async.value });
      document.getElementById('body').innerText = async.value;
    });
  }

  render() {
    const { title, isOfficeInitialized } = this.props;

    if (!isOfficeInitialized) {
      return (
        <Progress
          title={title}
          logo={require("./../../../assets/logo-filled.png")}
          message="Please sideload your addin to see app body."
        />
      );
    }

    return (
      <div>
        <h1>Nigerian Prince Detector</h1>
        <h2>Message Body</h2>
        <p id='body'></p>
        <h2>Spelling Mistakes</h2>
        <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit.</p>
      </div>
    );
  }
}
