package tddClass;

public class Question {
   public String prompt;
   public String answerA;
    String answerB;

    public Question(String prompt, String answerA, String answerB){
        this.setPrompt(prompt);
        this.answerA = answerA;
        this.answerB = answerB;
    }
    private String getPrompt() {
        return prompt;
    }
    private void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
