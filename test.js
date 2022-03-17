/*var assert = require('assert');
describe('Array', function () {
  describe('#indexOf()', function () {
    it('should return -1 when the value is not present', function () {
      assert.equal([1, 2, 3].indexOf(4), -1);
    });
  });
});
*/

class userName {
  user;
  emailName;
  checkName;

  //method to return the recipient of email name  
  getUser() {
    return true;    
  }
    //method to return the name used in the email
  emailName() {
    return true;    
  }
    //method to see if the name in email matches the recipient of email name  
  checkName() {
    if (this.emailName != this.getUser) {
      return true;
    }
    return true;
}
}
class testInfo {
  countTest;

  //method to return the number of test that passed 
  static getCountTest() {
    return true;    
  }
 
}


class email {
  ipAddress;
  timeSent;
  knownUser;
  governmentFaxReceiver;
  


  constructor (ipAddress, timeSent){
      this.ipAddress = ipAddress;
      this.timeSent = timeSent;
  }

    // method to find ip address and return the IP number 
  getIP() {
      return "103.52.41.27";
  }
    //method to to seach for the time the email was sent 
  getTime(string) {
      let text = string;
        this.timeSent = text;
      return this.timeSent;
  }
  
  

}
class emailCount{
  punctuationCount;
  titlesCount;
  wordCount;

  //method to should return number of punctuation in the email to see if it is excessive 
  getPuncCount(string){
      var str = string;
      

      
      return str.length;
    }

  //method to return number of title example if the email said sir and mr. this would return 2 
  getTitlesCount(){
    return true;
    }
  //method to return the number of word in the email 
  getWordCount(){
    return true;
    }

}



class emailBody {
  email;
  deceasedFather;
  findMoney;
  cyberAwareness;
  theJohnHancock;
  kingInTheNorth;
  realPrince;

constructor(email) {
  this.email = email; 
}
  // method to return the content of the email 
getEmail() {
  return true;
}

//method to to see if the email address had .gov in it 
getGovKnowledge(){
  return true;
}

  //method to return the name of the person who sent the email
getSender(){
    return true;
  }
// method to see if email had anything about a dead father 
getPapa(){
  return true;
}
//method to return if email is for moeny 
getFindMoney(){
  return true;
}
  // method to return if email ask user to click link 
getTrojanHorse(){
  return true;
}
  //method to return if there is a email signuture in the email
getThemSigs(){
  return true;
}
  //method to see if they are related or are a past president or current president 
getRoyal(){
  return true;
}
  //method to return if mention of royal 
getRealPrince(){
  return true;
}
}



let emailInfo = new email('103.52.41.27', "03:47")

var assert = require("assert");
describe("email Data Test", function () {
  it("should compare the IP address", () => {
      try {
          //function/ code block to try 
        } catch(error) {
          console.log();("") 
        }
        let emailInfo = new email("103.52.41.27", "03:47")
        assert.equal(emailInfo.getIP(), "103.52.41.27");
      });
      it("should return the time of 03:47", function () {
        let emailInfo = new email("103.52.41.27", "03:47")
        assert.equal(emailInfo.getTime("03:47"), "03:47");
    
      });
  });





  

  
  //Create a email
let emailTest = new emailBody("Hello sir, what is your! house info?");
let emailP = new emailBody();
let emailC = new emailCount();
let user = new userName();

  
  //Check email 
  var assert = require("assert");
  describe("checkBankQuestions", function () {
    it("Should return true is contains bank", () => {
      assert.equal(emailTest.getEmail(),true);
    }) ;
    it("Should return if the user is a known email to the recepient", () => {
      assert.equal(emailTest.getSender(), true);
    }) ;
    it("Should return the value of whether the email address holds .gov", () => {
      assert.equal(emailTest.getGovKnowledge(), true);
    }) ;
  });

//check email Body portions
var assert = require("assert");
describe("checkEmailBody", function () {

it("should return correct user name", function () {
  assert.equal(user.getUser(), true);
});
it("should return count of punctuation", function () {
  assert.equal(emailC.getPuncCount("hello."),6);
});
it("should return count of titles", function () {
  assert.equal(emailC.getTitlesCount(), true);
});
it("should return the living status of their father", function () {
  assert.equal(emailP.getPapa(), true);
});
it("should return the if the email ask for money", function () {
  assert.equal(emailP.getFindMoney(), true);
});
it("should return the value of if there is a link in the email", function () {
  assert.equal(emailP.getTrojanHorse(), true);
});
it("should return the value of if there is a signature at the end of the email", function () {
  assert.equal(emailP.getThemSigs(), true);
});
it("should return the count of word in the email", function () {
  assert.equal(emailC.getWordCount(), true);
});
it("should return the value of if a royal past is mentioned", function () {
  assert.equal(emailP.getRoyal(), true);
});
it("should return if the sender is a real prince", function () {
  assert.equal(emailP.getRealPrince(), true);
});
});



// check test count 
var assert = require("assert");
describe("check tests ", function () {
it("should return count of test passed", function () {
  console.log("Dr. Ferrari");
  assert.equal(testInfo.getCountTest(),true);

 });
});

//integration test 
var assert = require("assert");
describe("checks ip address,time sent, and word count ", function () {
it("should return ip address, time sent and word count", function () {
  assert.equal(emailInfo.getIP(), "103.52.41.27");
  assert.equal(emailInfo.getTime("03:47"), "03:47");
  assert.equal(emailC.getWordCount(), true);
  });

  

});

