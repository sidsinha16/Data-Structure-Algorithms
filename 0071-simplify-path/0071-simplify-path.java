class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
		Stack<String> stack = new Stack<>();
		
		for(String s : arr) {
			if(s.equals("..")) {
                if(!stack.isEmpty()){
				    stack.pop();
                }
			}else if(s.isBlank()|| s.equals(".")) {
				continue;
			}else {
				stack.push(s);
			}
		}

		if (stack.isEmpty()) {
            return "/";
        } else {
            return createPath(stack);
        }
	}
	
	public String createPath(Stack<String> st) {
		String res = "";
		for(String s : st) {
			res = res+"/"+s;
		}
		
		System.out.println(res);
		return res;
	}
}