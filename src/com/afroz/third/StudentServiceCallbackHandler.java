
/**
 * StudentServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */

    package com.afroz.third;

    /**
     *  StudentServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class StudentServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public StudentServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public StudentServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for addStudent method
            * override this method for handling normal response from addStudent operation
            */
           public void receiveResultaddStudent(
                    com.afroz.third.StudentServiceStub.AddStudentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addStudent operation
           */
            public void receiveErroraddStudent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStudents method
            * override this method for handling normal response from getStudents operation
            */
           public void receiveResultgetStudents(
                    com.afroz.third.StudentServiceStub.GetStudentsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStudents operation
           */
            public void receiveErrorgetStudents(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeStudent method
            * override this method for handling normal response from removeStudent operation
            */
           public void receiveResultremoveStudent(
                    com.afroz.third.StudentServiceStub.RemoveStudentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeStudent operation
           */
            public void receiveErrorremoveStudent(java.lang.Exception e) {
            }
                


    }
    