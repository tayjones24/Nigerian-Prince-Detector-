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
  constructor(props: AppProps, context) {
    super(props, context);
    this.state = {
      body: "",
    };
  }

  async componentDidMount() {
    Office.context.mailbox.item.body.getAsync("text",  (async) => {
      this.setState({body: async.value});
    });
  }

  render() {
    //#region ignore
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
  //#endregion

    return (
      <div>
        <h1>Nigerian Prince Detector</h1>
        <h2>Message Body</h2>
        <p id="body">{this.state.body}</p>
        <h2>Spelling Mistakes</h2>
        <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit.</p>
      </div>
    );
  }
}
