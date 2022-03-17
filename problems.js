/*
function getBankInfo(){
    let email = "Hello sir, what is your! house info?";
    let result = email.includes("bank");
    return result;
}

var assert = require("assert");
describe("bank info", function () {
it("should return true if bank is found", function () {
  assert.expect(getBankInfo(email).equal(result),false);
})
})
*/
/*
class bankInfo {
    email;

    constructor(email) {
      this.email = email; 
    }

    GetEmail() {
      this.email
      result = email.includes("bank")
      return result
    }
    getBankInfo(){
        result = email.includes("bank")
        return result
    }
  }
  //Create a email
let email = ["Hello sir, what is your! house info?"];
  
  //Check email 
  var assert = require("assert");
  describe("trueOrFalse", function () {
    it("Should return true is contains bank", () => {
      assert.equal(getbankInfo(0),false);
    }) ;
})
/*
var assert = require("assert");
describe("Search", function () {
  it("should return an array of length greater than zero", function () {
    assert.equal(myWallet.profileRedirect());
  });
});
*/










class email {
    ipAddress;
    timeSent;


    constructor (ipAddress, timeSent){
        this.ipAddress = ipAddress;
        this.timeSent = timeSent;
    }

    getIP() {
        return this.ipAddress;
    }

    getTime() {
        return this.timeSent;
    }

}

let emailInfo = new email("103.52.41.27", "03:47")

var assert = require("assert");
describe("emailDataTest", function () {
    it("should return wallet id of zero", () => {
        try {
            //function/ code block to try 
          } catch(error) {
            console.log(); 
          }
          let emailInfo = new email("103.52.41.27", "03:47");

          assert.equal(0, 0);
        });
    });
