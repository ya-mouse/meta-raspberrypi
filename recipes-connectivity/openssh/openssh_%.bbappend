do_install:append() {
    sed 's,^Subsystem.*,Subsystem sftp internal-sftp,' -i ${D}/etc/ssh/sshd_config
}
