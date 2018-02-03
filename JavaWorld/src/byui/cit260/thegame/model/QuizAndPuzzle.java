/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;
import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author Rayshorn Richardson
 */
public class QuizAndPuzzle implements Serializable{
    
    private String question;
    private String answer;
    private boolean reward;
    private ArrayList<Quest> quests = new ArrayList<Quest>();

    public QuizAndPuzzle() {
    }

    public ArrayList<Quest> getQuests() {
        return quests;
    }

    public void setQuests(ArrayList<Quest> quests) {
        this.quests = quests;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isReward() {
        return reward;
    }

    public void setReward(boolean reward) {
        this.reward = reward;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.question);
        hash = 71 * hash + Objects.hashCode(this.answer);
        hash = 71 * hash + (this.reward ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "QuizAndPuzzle{" + "question=" + question + ", answer=" + answer + ", reward=" + reward + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuizAndPuzzle other = (QuizAndPuzzle) obj;
        if (this.reward != other.reward) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        return true;
    }
    
    
}
