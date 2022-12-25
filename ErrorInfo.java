public class ErrorInfo {
  
  String msgs[] = {
    "Input Error.",
    "Output Error.",
    "Disk Out of Space.",
    "Index Out of Range.",
  };

  int levels[] = { 3, 3, 2, 4, };

  Err getErrorInfo(int i) {
    return (i >= 0 & i < msgs.length) ? 
      new Err(msgs[i], levels[i]) : 
      new Err("Error Code Faild.", 0);
  }
}
