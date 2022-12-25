// Return String object
public class ErrorMsg {
  
  String msg[] = {
    "Input Error.",
    "Output Error.",
    "Disk Out of Space.",
    "Index Out of Range.",
  };

  // Return Error Message
  String getErrorMsg(int i) {
    if (i >= 0 & i < msg.length) return msg[i];
    else return "Error Code Not Found.";
  }
}
