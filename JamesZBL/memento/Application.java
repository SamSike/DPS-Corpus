/**
 * MIT License
 * <p>
 * Copyright (c) 2017 James
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package me.zbl.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * Memento
 */
public class Application {

  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    Stack<Plant> stack = new Stack<>();

    Flower flower = new Flower(FlowerType.SEED, "水仙花", 1, 2);
    stack.add(flower.getMemento());
    LOGGER.info(flower.toString());
    flower.growing();
    stack.add(flower.getMemento());
    LOGGER.info(flower.toString());
    flower.growing();
    stack.add(flower.getMemento());
    LOGGER.info(flower.toString());
    flower.growing();
    stack.add(flower.getMemento());
    LOGGER.info(flower.toString());
    flower.growing();
    stack.add(flower.getMemento());
    LOGGER.info(flower.toString());
    flower.growing();
    stack.add(flower.getMemento());
    LOGGER.info(flower.toString());

    while (stack.size() > 0) {
      flower.setMemento(stack.pop());
      LOGGER.info(flower.toString());
    }
  }
}
