/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.model;
import java.io.Serializable;
import java.awt.Point;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author Rayshorn Richardson
 */
public class Quest implements Serializable{
    
    private boolean reward;
    private Point coordinate;
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    private ArrayList<QuizAndPuzzle> quizzes = new ArrayList<QuizAndPuzzle>();
    

    public Quest() {
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public ArrayList<QuizAndPuzzle> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(ArrayList<QuizAndPuzzle> quizzes) {
        this.quizzes = quizzes;
    }

    public boolean isReward() {
        return reward;
    }

    public void setReward(boolean reward) {
        this.reward = reward;
    }

    public Point getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Point coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.reward ? 1 : 0);
        hash = 41 * hash + Objects.hashCode(this.coordinate);
        return hash;
    }

    @Override
    public String toString() {
        return "Quest{" + "reward=" + reward + ", coordinate=" + coordinate + '}';
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
        final Quest other = (Quest) obj;
        if (this.reward != other.reward) {
            return false;
        }
        if (!Objects.equals(this.coordinate, other.coordinate)) {
            return false;
        }
        return true;
    }
    
    
}
