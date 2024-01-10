package com.gonzalo.rentbooks.model.error;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ErrorMessage {
		private String path;
        private int status;
        @JsonInclude(Include.NON_NULL)
        private List<ErrorItem> errors;

        
        public ErrorMessage() {
		}
        public ErrorMessage(int status, String path, List<ErrorItem> errors) {
            this.status = status;
            this.path = path;
            this.errors = errors;
        }
        
        
		public void setPath(String path) {
			this.path = path;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public void setErrors(List<ErrorItem> errors) {
			this.errors = errors;
		}
		public String getPath() {
			return path;
		}
		public int getStatus() {
			return status;
		}
		public List<ErrorItem> getErrors() {
			return errors;
		}
        
}
