do_install_append() {
    sed 's,^Subsystem.*,Subsystem internal-sftp,' -i ${D}/etc/ssh/sshd_config
}
