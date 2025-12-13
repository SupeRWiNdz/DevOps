import jenkins.model.*
import hudson.model.*
import hudson.security.*
import com.cloudbees.plugins.credentials.*
import com.cloudbees.plugins.credentials.common.*
import com.cloudbees.plugins.credentials.domains.*
import com.cloudbees.plugins.credentials.impl.*
import hudson.util.Secret
import hudson.plugins.sshslaves.*
import jenkins.plugins.ansible.*

def instance = Jenkins.instance