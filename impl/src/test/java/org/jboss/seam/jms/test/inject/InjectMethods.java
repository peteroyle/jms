/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.seam.jms.test.inject;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.Queue;
import javax.jms.Topic;

import org.jboss.seam.jms.test.MyQueue;
import org.jboss.seam.jms.test.MyTopic;

@Named
public class InjectMethods
{

   private Topic t;
   private Queue q;

   @Inject
   public void initTopic(@MyTopic Topic topic)
   {
      t = topic;
   }

   @Inject
   public void initQueue(@MyQueue Queue queue)
   {
      q = queue;
   }

   public Topic getT()
   {
      return t;
   }

   public Queue getQ()
   {
      return q;
   }
}
